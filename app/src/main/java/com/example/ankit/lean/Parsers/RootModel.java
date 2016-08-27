import java.util.ArrayList;

class RootModel {

	public String topic;
	public String description;
	public CreatorModel _creator;
	public String type;
	public String state;
	public String schedule_published_on;
	public VersionModel _version;
	public String organizer_name;
	public String name;
	public String background_image;
	public String end_time;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String start_time;
	public String privacy;
	public String code_of_conduct;
	public String organizer_description;
	public String email;
	public int id;
	public String logo;
	public String timezone;

	public RootModel(String topic, String description, CreatorModel creator, String type, String state, String schedule_published_on, VersionModel version, String organizer_name, String name, String background_image, String end_time, String location_name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String start_time, String privacy, String code_of_conduct, String organizer_description, String email, int id, String logo, String timezone) {

		this.topic = topic;
		this.description = description;
		this._creator = creator;
		this.type = type;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.organizer_name = organizer_name;
		this.name = name;
		this.background_image = background_image;
		this.end_time = end_time;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this._copyright = copyright;
		this.start_time = start_time;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.email = email;
		this.id = id;
		this.logo = logo;
		this.timezone = timezone;

	}

}