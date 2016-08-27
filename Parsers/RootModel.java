import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String email;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String background_image;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String organizer_name;
	public String start_time;
	public int id;
	public String state;
	public String location_name;
	public String code_of_conduct;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String privacy;
	public String topic;
	public String type;
	public String end_time;
	public CopyrightModel _copyright;
	public String timezone;

	public RootModel(String organizer_description, String email, String description, Call_for_papersModel call_for_papers, VersionModel version, String background_image, CreatorModel creator, String schedule_published_on, String organizer_name, String start_time, int id, String state, String location_name, String code_of_conduct, String name, ArrayList<Social_linksModel> social_links, String logo, String privacy, String topic, String type, String end_time, CopyrightModel copyright, String timezone) {

		this.organizer_description = organizer_description;
		this.email = email;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.background_image = background_image;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.id = id;
		this.state = state;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.social_links = social_links;
		this.logo = logo;
		this.privacy = privacy;
		this.topic = topic;
		this.type = type;
		this.end_time = end_time;
		this._copyright = copyright;
		this.timezone = timezone;

	}

}