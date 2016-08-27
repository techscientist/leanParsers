import java.util.ArrayList;

class RootModel {

	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String location_name;
	public String organizer_description;
	public String topic;
	public String start_time;
	public String code_of_conduct;
	public String timezone;
	public String email;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String privacy;
	public String state;
	public String name;
	public VersionModel _version;
	public CreatorModel _creator;
	public String type;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String end_time;
	public int id;

	public RootModel(String background_image, ArrayList<Social_linksModel> social_links, String description, String location_name, String organizer_description, String topic, String start_time, String code_of_conduct, String timezone, String email, String logo, Call_for_papersModel call_for_papers, String organizer_name, String privacy, String state, String name, VersionModel version, CreatorModel creator, String type, CopyrightModel copyright, String schedule_published_on, String end_time, int id) {

		this.background_image = background_image;
		this.social_links = social_links;
		this.description = description;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.email = email;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.state = state;
		this.name = name;
		this._version = version;
		this._creator = creator;
		this.type = type;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.id = id;

	}

}