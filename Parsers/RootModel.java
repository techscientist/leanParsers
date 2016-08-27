import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String logo;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String state;
	public String organizer_name;
	public String description;
	public int id;
	public String code_of_conduct;
	public String name;
	public String background_image;
	public String email;
	public String end_time;
	public String topic;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String start_time;
	public String type;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String timezone;

	public RootModel(String location_name, String logo, String schedule_published_on, CreatorModel creator, String state, String organizer_name, String description, int id, String code_of_conduct, String name, String background_image, String email, String end_time, String topic, VersionModel version, Call_for_papersModel call_for_papers, String privacy, String start_time, String type, String organizer_description, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String timezone) {

		this.location_name = location_name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.state = state;
		this.organizer_name = organizer_name;
		this.description = description;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.background_image = background_image;
		this.email = email;
		this.end_time = end_time;
		this.topic = topic;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.start_time = start_time;
		this.type = type;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this._copyright = copyright;
		this.timezone = timezone;

	}

}