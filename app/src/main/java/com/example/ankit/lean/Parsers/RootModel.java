import java.util.ArrayList;

class RootModel {

	public String end_time;
	public VersionModel _version;
	public String organizer_description;
	public String background_image;
	public String description;
	public String email;
	public CreatorModel _creator;
	public String timezone;
	public String privacy;
	public CopyrightModel _copyright;
	public String location_name;
	public String state;
	public String name;
	public String code_of_conduct;
	public String start_time;
	public String organizer_name;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String topic;
	public int id;

	public RootModel(String end_time, VersionModel version, String organizer_description, String background_image, String description, String email, CreatorModel creator, String timezone, String privacy, CopyrightModel copyright, String location_name, String state, String name, String code_of_conduct, String start_time, String organizer_name, String schedule_published_on, Call_for_papersModel call_for_papers, String logo, ArrayList<Social_linksModel> social_links, String type, String topic, int id) {

		this.end_time = end_time;
		this._version = version;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.description = description;
		this.email = email;
		this._creator = creator;
		this.timezone = timezone;
		this.privacy = privacy;
		this._copyright = copyright;
		this.location_name = location_name;
		this.state = state;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.social_links = social_links;
		this.type = type;
		this.topic = topic;
		this.id = id;

	}

}