import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String end_time;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String code_of_conduct;
	public String start_time;
	public String privacy;
	public int id;
	public String state;
	public String location_name;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String email;
	public String description;
	public String logo;
	public String schedule_published_on;
	public String name;
	public String background_image;
	public String timezone;

	public RootModel(String organizer_description, String end_time, String organizer_name, CopyrightModel copyright, String type, Call_for_papersModel call_for_papers, String topic, String code_of_conduct, String start_time, String privacy, int id, String state, String location_name, VersionModel version, ArrayList<Social_linksModel> social_links, CreatorModel creator, String email, String description, String logo, String schedule_published_on, String name, String background_image, String timezone) {

		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.privacy = privacy;
		this.id = id;
		this.state = state;
		this.location_name = location_name;
		this._version = version;
		this.social_links = social_links;
		this._creator = creator;
		this.email = email;
		this.description = description;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.background_image = background_image;
		this.timezone = timezone;

	}

}