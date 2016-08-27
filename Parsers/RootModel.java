import java.util.ArrayList;

class RootModel {

	public String name;
	public String schedule_published_on;
	public String background_image;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String organizer_description;
	public String topic;
	public String location_name;
	public String timezone;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String end_time;
	public CopyrightModel _copyright;
	public String type;
	public String state;
	public VersionModel _version;
	public String logo;
	public String email;
	public String privacy;
	public String description;
	public int id;

	public RootModel(String name, String schedule_published_on, String background_image, String code_of_conduct, CreatorModel creator, String organizer_description, String topic, String location_name, String timezone, String start_time, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String organizer_name, String end_time, CopyrightModel copyright, String type, String state, VersionModel version, String logo, String email, String privacy, String description, int id) {

		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.location_name = location_name;
		this.timezone = timezone;
		this.start_time = start_time;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this._copyright = copyright;
		this.type = type;
		this.state = state;
		this._version = version;
		this.logo = logo;
		this.email = email;
		this.privacy = privacy;
		this.description = description;
		this.id = id;

	}

}