import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String start_time;
	public String name;
	public CreatorModel _creator;
	public String background_image;
	public String topic;
	public String logo;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String organizer_description;
	public String location_name;
	public String privacy;
	public String description;
	public String schedule_published_on;
	public String organizer_name;
	public String end_time;
	public int id;
	public CopyrightModel _copyright;
	public String email;
	public String timezone;

	public RootModel(String code_of_conduct, String start_time, String name, CreatorModel creator, String background_image, String topic, String logo, String type, ArrayList<Social_linksModel> social_links, String state, Call_for_papersModel call_for_papers, VersionModel version, String organizer_description, String location_name, String privacy, String description, String schedule_published_on, String organizer_name, String end_time, int id, CopyrightModel copyright, String email, String timezone) {

		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.name = name;
		this._creator = creator;
		this.background_image = background_image;
		this.topic = topic;
		this.logo = logo;
		this.type = type;
		this.social_links = social_links;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.privacy = privacy;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.id = id;
		this._copyright = copyright;
		this.email = email;
		this.timezone = timezone;

	}

}