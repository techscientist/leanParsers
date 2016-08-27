import java.util.ArrayList;

class RootModel {

	public String logo;
	public VersionModel _version;
	public String organizer_description;
	public String end_time;
	public String location_name;
	public String type;
	public String schedule_published_on;
	public String start_time;
	public String code_of_conduct;
	public String description;
	public String background_image;
	public String email;
	public CreatorModel _creator;
	public String name;
	public String privacy;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String topic;
	public int id;
	public String state;
	public String timezone;

	public RootModel(String logo, VersionModel version, String organizer_description, String end_time, String location_name, String type, String schedule_published_on, String start_time, String code_of_conduct, String description, String background_image, String email, CreatorModel creator, String name, String privacy, String organizer_name, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, CopyrightModel copyright, String topic, int id, String state, String timezone) {

		this.logo = logo;
		this._version = version;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.location_name = location_name;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.background_image = background_image;
		this.email = email;
		this._creator = creator;
		this.name = name;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.topic = topic;
		this.id = id;
		this.state = state;
		this.timezone = timezone;

	}

}