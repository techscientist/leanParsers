import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String organizer_description;
	public String end_time;
	public String background_image;
	public String location_name;
	public String name;
	public int id;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String type;
	public String email;
	public String code_of_conduct;
	public String start_time;
	public String privacy;
	public String description;
	public String schedule_published_on;
	public String state;
	public String topic;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String timezone;

	public RootModel(String organizer_name, ArrayList<Social_linksModel> social_links, CreatorModel creator, String organizer_description, String end_time, String background_image, String location_name, String name, int id, VersionModel version, CopyrightModel copyright, String type, String email, String code_of_conduct, String start_time, String privacy, String description, String schedule_published_on, String state, String topic, String logo, Call_for_papersModel call_for_papers, String timezone) {

		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.background_image = background_image;
		this.location_name = location_name;
		this.name = name;
		this.id = id;
		this._version = version;
		this._copyright = copyright;
		this.type = type;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.privacy = privacy;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.topic = topic;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;

	}

}