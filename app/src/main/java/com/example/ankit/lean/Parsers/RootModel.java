import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String privacy;
	public String background_image;
	public VersionModel _version;
	public String type;
	public String state;
	public String end_time;
	public String description;
	public String organizer_description;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String logo;
	public String email;
	public String start_time;
	public CopyrightModel _copyright;
	public int id;
	public String organizer_name;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String timezone;

	public RootModel(String schedule_published_on, String privacy, String background_image, VersionModel version, String type, String state, String end_time, String description, String organizer_description, String code_of_conduct, CreatorModel creator, String logo, String email, String start_time, CopyrightModel copyright, int id, String organizer_name, String location_name, ArrayList<Social_linksModel> social_links, String name, String topic, Call_for_papersModel call_for_papers, String timezone) {

		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.background_image = background_image;
		this._version = version;
		this.type = type;
		this.state = state;
		this.end_time = end_time;
		this.description = description;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.logo = logo;
		this.email = email;
		this.start_time = start_time;
		this._copyright = copyright;
		this.id = id;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.social_links = social_links;
		this.name = name;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;

	}

}