import java.util.ArrayList;

class RootModel {

	public String topic;
	public VersionModel _version;
	public String start_time;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String state;
	public String description;
	public String name;
	public String location_name;
	public String privacy;
	public String end_time;
	public String logo;
	public CreatorModel _creator;
	public String email;
	public String type;
	public int id;
	public String timezone;

	public RootModel(String topic, VersionModel version, String start_time, String organizer_description, ArrayList<Social_linksModel> social_links, String code_of_conduct, String schedule_published_on, CopyrightModel copyright, String background_image, Call_for_papersModel call_for_papers, String organizer_name, String state, String description, String name, String location_name, String privacy, String end_time, String logo, CreatorModel creator, String email, String type, int id, String timezone) {

		this.topic = topic;
		this._version = version;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.state = state;
		this.description = description;
		this.name = name;
		this.location_name = location_name;
		this.privacy = privacy;
		this.end_time = end_time;
		this.logo = logo;
		this._creator = creator;
		this.email = email;
		this.type = type;
		this.id = id;
		this.timezone = timezone;

	}

}