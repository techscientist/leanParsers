import java.util.ArrayList;

class RootModel {

	public String name;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String start_time;
	public String privacy;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String background_image;
	public String organizer_description;
	public String topic;
	public String schedule_published_on;
	public String description;
	public String email;
	public String state;
	public String logo;
	public CopyrightModel _copyright;
	public String type;
	public String end_time;
	public String organizer_name;
	public int id;

	public RootModel(String name, String timezone, Call_for_papersModel call_for_papers, CreatorModel creator, String code_of_conduct, String start_time, String privacy, VersionModel version, ArrayList<Social_linksModel> social_links, String location_name, String background_image, String organizer_description, String topic, String schedule_published_on, String description, String email, String state, String logo, CopyrightModel copyright, String type, String end_time, String organizer_name, int id) {

		this.name = name;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.privacy = privacy;
		this._version = version;
		this.social_links = social_links;
		this.location_name = location_name;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.email = email;
		this.state = state;
		this.logo = logo;
		this._copyright = copyright;
		this.type = type;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.id = id;

	}

}