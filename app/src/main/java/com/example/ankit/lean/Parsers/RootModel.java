import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String end_time;
	public String background_image;
	public CreatorModel _creator;
	public String logo;
	public String schedule_published_on;
	public String name;
	public String code_of_conduct;
	public String topic;
	public String organizer_name;
	public String type;
	public String privacy;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String start_time;
	public String description;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public int id;

	public RootModel(String organizer_description, String end_time, String background_image, CreatorModel creator, String logo, String schedule_published_on, String name, String code_of_conduct, String topic, String organizer_name, String type, String privacy, String email, ArrayList<Social_linksModel> social_links, String state, String start_time, String description, String timezone, Call_for_papersModel call_for_papers, String location_name, CopyrightModel copyright, VersionModel version, int id) {

		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.background_image = background_image;
		this._creator = creator;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.type = type;
		this.privacy = privacy;
		this.email = email;
		this.social_links = social_links;
		this.state = state;
		this.start_time = start_time;
		this.description = description;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this._copyright = copyright;
		this._version = version;
		this.id = id;

	}

}