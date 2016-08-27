import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String description;
	public VersionModel _version;
	public String email;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String privacy;
	public String code_of_conduct;
	public String name;
	public String topic;
	public String logo;
	public String end_time;
	public String timezone;
	public String organizer_description;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String start_time;
	public String type;
	public int id;

	public RootModel(String location_name, String description, VersionModel version, String email, CreatorModel creator, ArrayList<Social_linksModel> social_links, String organizer_name, String privacy, String code_of_conduct, String name, String topic, String logo, String end_time, String timezone, String organizer_description, String state, Call_for_papersModel call_for_papers, String background_image, CopyrightModel copyright, String schedule_published_on, String start_time, String type, int id) {

		this.location_name = location_name;
		this.description = description;
		this._version = version;
		this.email = email;
		this._creator = creator;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.topic = topic;
		this.logo = logo;
		this.end_time = end_time;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.type = type;
		this.id = id;

	}

}