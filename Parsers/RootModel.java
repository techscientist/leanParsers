import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String background_image;
	public String email;
	public String start_time;
	public String location_name;
	public int id;
	public String organizer_name;
	public String logo;
	public VersionModel _version;
	public String schedule_published_on;
	public String name;
	public String description;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String topic;
	public String state;
	public String type;
	public String timezone;

	public RootModel(String end_time, String background_image, String email, String start_time, String location_name, int id, String organizer_name, String logo, VersionModel version, String schedule_published_on, String name, String description, String code_of_conduct, CopyrightModel copyright, Call_for_papersModel call_for_papers, String organizer_description, CreatorModel creator, ArrayList<Social_linksModel> social_links, String privacy, String topic, String state, String type, String timezone) {

		this.end_time = end_time;
		this.background_image = background_image;
		this.email = email;
		this.start_time = start_time;
		this.location_name = location_name;
		this.id = id;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.social_links = social_links;
		this.privacy = privacy;
		this.topic = topic;
		this.state = state;
		this.type = type;
		this.timezone = timezone;

	}

}