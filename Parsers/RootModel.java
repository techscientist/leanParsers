import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String location_name;
	public String name;
	public CreatorModel _creator;
	public String state;
	public int id;
	public String organizer_name;
	public String background_image;
	public String topic;
	public String end_time;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String start_time;
	public String timezone;
	public VersionModel _version;
	public String privacy;
	public String code_of_conduct;
	public String schedule_published_on;
	public String organizer_description;

	public RootModel(CopyrightModel copyright, String location_name, String name, CreatorModel creator, String state, int id, String organizer_name, String background_image, String topic, String end_time, String logo, ArrayList<Social_linksModel> social_links, String description, String type, Call_for_papersModel call_for_papers, String email, String start_time, String timezone, VersionModel version, String privacy, String code_of_conduct, String schedule_published_on, String organizer_description) {

		this._copyright = copyright;
		this.location_name = location_name;
		this.name = name;
		this._creator = creator;
		this.state = state;
		this.id = id;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.topic = topic;
		this.end_time = end_time;
		this.logo = logo;
		this.social_links = social_links;
		this.description = description;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.start_time = start_time;
		this.timezone = timezone;
		this._version = version;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;

	}

}