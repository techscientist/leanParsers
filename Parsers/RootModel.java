import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String name;
	public String description;
	public String type;
	public String topic;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public VersionModel _version;
	public String code_of_conduct;
	public String state;
	public String start_time;
	public String end_time;
	public String organizer_description;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String privacy;
	public String email;
	public int id;
	public String timezone;

	public RootModel(String schedule_published_on, String name, String description, String type, String topic, CopyrightModel copyright, String organizer_name, String location_name, Call_for_papersModel call_for_papers, String logo, VersionModel version, String code_of_conduct, String state, String start_time, String end_time, String organizer_description, CreatorModel creator, ArrayList<Social_linksModel> social_links, String background_image, String privacy, String email, int id, String timezone) {

		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.description = description;
		this.type = type;
		this.topic = topic;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.start_time = start_time;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.social_links = social_links;
		this.background_image = background_image;
		this.privacy = privacy;
		this.email = email;
		this.id = id;
		this.timezone = timezone;

	}

}