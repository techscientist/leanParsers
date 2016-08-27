import java.util.ArrayList;

class RootModel {

	public String description;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String background_image;
	public String organizer_name;
	public VersionModel _version;
	public String topic;
	public int id;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String organizer_description;
	public String name;
	public String email;
	public String schedule_published_on;
	public String state;
	public CreatorModel _creator;
	public String type;
	public String end_time;
	public String location_name;
	public String logo;
	public String code_of_conduct;
	public String timezone;

	public RootModel(String description, Call_for_papersModel call_for_papers, String privacy, String background_image, String organizer_name, VersionModel version, String topic, int id, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String start_time, String organizer_description, String name, String email, String schedule_published_on, String state, CreatorModel creator, String type, String end_time, String location_name, String logo, String code_of_conduct, String timezone) {

		this.description = description;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this._version = version;
		this.topic = topic;
		this.id = id;
		this._copyright = copyright;
		this.social_links = social_links;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.name = name;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this._creator = creator;
		this.type = type;
		this.end_time = end_time;
		this.location_name = location_name;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;

	}

}