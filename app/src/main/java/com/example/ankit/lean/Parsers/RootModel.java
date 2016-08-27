import java.util.ArrayList;

class RootModel {

	public String state;
	public CopyrightModel _copyright;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String description;
	public String end_time;
	public String email;
	public String organizer_name;
	public String name;
	public VersionModel _version;
	public String type;
	public String schedule_published_on;
	public String logo;
	public String location_name;
	public CreatorModel _creator;
	public String start_time;
	public String code_of_conduct;
	public String topic;
	public String privacy;
	public int id;
	public String timezone;

	public RootModel(String state, CopyrightModel copyright, String organizer_description, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String background_image, String description, String end_time, String email, String organizer_name, String name, VersionModel version, String type, String schedule_published_on, String logo, String location_name, CreatorModel creator, String start_time, String code_of_conduct, String topic, String privacy, int id, String timezone) {

		this.state = state;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.background_image = background_image;
		this.description = description;
		this.end_time = end_time;
		this.email = email;
		this.organizer_name = organizer_name;
		this.name = name;
		this._version = version;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.location_name = location_name;
		this._creator = creator;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.privacy = privacy;
		this.id = id;
		this.timezone = timezone;

	}

}