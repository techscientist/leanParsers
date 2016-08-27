import java.util.ArrayList;

class RootModel {

	public String location_name;
	public CopyrightModel _copyright;
	public String start_time;
	public CreatorModel _creator;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public int id;
	public String logo;
	public String topic;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String code_of_conduct;
	public String privacy;
	public String description;
	public String end_time;
	public String timezone;
	public String type;
	public String name;
	public String schedule_published_on;
	public String organizer_description;
	public String organizer_name;

	public RootModel(String location_name, CopyrightModel copyright, String start_time, CreatorModel creator, VersionModel version, Call_for_papersModel call_for_papers, String email, int id, String logo, String topic, String state, ArrayList<Social_linksModel> social_links, String background_image, String code_of_conduct, String privacy, String description, String end_time, String timezone, String type, String name, String schedule_published_on, String organizer_description, String organizer_name) {

		this.location_name = location_name;
		this._copyright = copyright;
		this.start_time = start_time;
		this._creator = creator;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.id = id;
		this.logo = logo;
		this.topic = topic;
		this.state = state;
		this.social_links = social_links;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.description = description;
		this.end_time = end_time;
		this.timezone = timezone;
		this.type = type;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;

	}

}