import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String organizer_name;
	public String code_of_conduct;
	public String name;
	public String end_time;
	public String state;
	public String type;
	public String background_image;
	public String timezone;
	public String location_name;
	public int id;
	public String email;
	public String topic;
	public String organizer_description;
	public VersionModel _version;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String privacy;
	public String schedule_published_on;
	public String description;

	public RootModel(CopyrightModel copyright, String organizer_name, String code_of_conduct, String name, String end_time, String state, String type, String background_image, String timezone, String location_name, int id, String email, String topic, String organizer_description, VersionModel version, CreatorModel creator, Call_for_papersModel call_for_papers, String start_time, ArrayList<Social_linksModel> social_links, String logo, String privacy, String schedule_published_on, String description) {

		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.end_time = end_time;
		this.state = state;
		this.type = type;
		this.background_image = background_image;
		this.timezone = timezone;
		this.location_name = location_name;
		this.id = id;
		this.email = email;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this._version = version;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.social_links = social_links;
		this.logo = logo;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.description = description;

	}

}