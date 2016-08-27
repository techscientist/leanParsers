import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String type;
	public int id;
	public String logo;
	public String name;
	public String location_name;
	public String state;
	public String organizer_name;
	public String timezone;
	public String end_time;
	public String background_image;
	public String privacy;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String email;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String organizer_description;
	public String code_of_conduct;
	public String description;

	public RootModel(VersionModel version, String type, int id, String logo, String name, String location_name, String state, String organizer_name, String timezone, String end_time, String background_image, String privacy, String start_time, ArrayList<Social_linksModel> social_links, CreatorModel creator, CopyrightModel copyright, String email, String topic, Call_for_papersModel call_for_papers, String schedule_published_on, String organizer_description, String code_of_conduct, String description) {

		this._version = version;
		this.type = type;
		this.id = id;
		this.logo = logo;
		this.name = name;
		this.location_name = location_name;
		this.state = state;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.end_time = end_time;
		this.background_image = background_image;
		this.privacy = privacy;
		this.start_time = start_time;
		this.social_links = social_links;
		this._creator = creator;
		this._copyright = copyright;
		this.email = email;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.description = description;

	}

}