import java.util.ArrayList;

class RootModel {

	public String email;
	public String end_time;
	public String start_time;
	public String name;
	public CreatorModel _creator;
	public String state;
	public String code_of_conduct;
	public String topic;
	public VersionModel _version;
	public String organizer_description;
	public String description;
	public int id;
	public String location_name;
	public String type;
	public String privacy;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String background_image;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String timezone;

	public RootModel(String email, String end_time, String start_time, String name, CreatorModel creator, String state, String code_of_conduct, String topic, VersionModel version, String organizer_description, String description, int id, String location_name, String type, String privacy, CopyrightModel copyright, String organizer_name, String background_image, String schedule_published_on, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String logo, String timezone) {

		this.email = email;
		this.end_time = end_time;
		this.start_time = start_time;
		this.name = name;
		this._creator = creator;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this._version = version;
		this.organizer_description = organizer_description;
		this.description = description;
		this.id = id;
		this.location_name = location_name;
		this.type = type;
		this.privacy = privacy;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.logo = logo;
		this.timezone = timezone;

	}

}