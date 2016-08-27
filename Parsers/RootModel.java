import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String type;
	public String description;
	public CopyrightModel _copyright;
	public String topic;
	public String location_name;
	public String privacy;
	public String email;
	public String end_time;
	public String organizer_description;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public int id;
	public VersionModel _version;
	public String background_image;
	public String start_time;
	public String timezone;
	public String code_of_conduct;
	public String name;

	public RootModel(String organizer_name, String type, String description, CopyrightModel copyright, String topic, String location_name, String privacy, String email, String end_time, String organizer_description, String state, Call_for_papersModel call_for_papers, CreatorModel creator, String logo, ArrayList<Social_linksModel> social_links, String schedule_published_on, int id, VersionModel version, String background_image, String start_time, String timezone, String code_of_conduct, String name) {

		this.organizer_name = organizer_name;
		this.type = type;
		this.description = description;
		this._copyright = copyright;
		this.topic = topic;
		this.location_name = location_name;
		this.privacy = privacy;
		this.email = email;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.logo = logo;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._version = version;
		this.background_image = background_image;
		this.start_time = start_time;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.name = name;

	}

}