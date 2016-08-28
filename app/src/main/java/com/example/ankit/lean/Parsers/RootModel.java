import java.util.ArrayList;

class RootModel {

	public String type;
	public String privacy;
	public String end_time;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String state;
	public String schedule_published_on;
	public String background_image;
	public String topic;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String description;
	public String start_time;
	public String organizer_name;
	public String organizer_description;
	public String email;
	public String name;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public VersionModel _version;
	public String timezone;

	public RootModel(String type, String privacy, String end_time, CreatorModel creator, String code_of_conduct, String state, String schedule_published_on, String background_image, String topic, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, int id, String description, String start_time, String organizer_name, String organizer_description, String email, String name, String location_name, Call_for_papersModel call_for_papers, String logo, VersionModel version, String timezone) {

		this.type = type;
		this.privacy = privacy;
		this.end_time = end_time;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.topic = topic;
		this._copyright = copyright;
		this.social_links = social_links;
		this.id = id;
		this.description = description;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.email = email;
		this.name = name;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this._version = version;
		this.timezone = timezone;

	}

}