import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String type;
	public String privacy;
	public VersionModel _version;
	public String state;
	public String end_time;
	public String location_name;
	public String organizer_name;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String description;
	public String background_image;
	public String code_of_conduct;
	public String schedule_published_on;
	public String start_time;
	public String logo;
	public String name;
	public CopyrightModel _copyright;
	public String email;
	public int id;

	public RootModel(String timezone, String type, String privacy, VersionModel version, String state, String end_time, String location_name, String organizer_name, String organizer_description, ArrayList<Social_linksModel> social_links, CreatorModel creator, Call_for_papersModel call_for_papers, String topic, String description, String background_image, String code_of_conduct, String schedule_published_on, String start_time, String logo, String name, CopyrightModel copyright, String email, int id) {

		this.timezone = timezone;
		this.type = type;
		this.privacy = privacy;
		this._version = version;
		this.state = state;
		this.end_time = end_time;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.description = description;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.logo = logo;
		this.name = name;
		this._copyright = copyright;
		this.email = email;
		this.id = id;

	}

}