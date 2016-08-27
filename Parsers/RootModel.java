import java.util.ArrayList;

class RootModel {

	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String start_time;
	public String state;
	public String email;
	public String schedule_published_on;
	public String privacy;
	public String topic;
	public String background_image;
	public CreatorModel _creator;
	public String organizer_name;
	public String code_of_conduct;
	public int id;
	public String name;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String location_name;
	public String end_time;
	public String type;
	public String timezone;

	public RootModel(String logo, Call_for_papersModel call_for_papers, String organizer_description, ArrayList<Social_linksModel> social_links, String description, String start_time, String state, String email, String schedule_published_on, String privacy, String topic, String background_image, CreatorModel creator, String organizer_name, String code_of_conduct, int id, String name, VersionModel version, CopyrightModel copyright, String location_name, String end_time, String type, String timezone) {

		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.description = description;
		this.start_time = start_time;
		this.state = state;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.topic = topic;
		this.background_image = background_image;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.name = name;
		this._version = version;
		this._copyright = copyright;
		this.location_name = location_name;
		this.end_time = end_time;
		this.type = type;
		this.timezone = timezone;

	}

}