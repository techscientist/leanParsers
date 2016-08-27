import java.util.ArrayList;

class RootModel {

	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String end_time;
	public String description;
	public String timezone;
	public VersionModel _version;
	public String type;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String background_image;
	public String email;
	public int id;
	public String topic;
	public String state;
	public String organizer_name;
	public String start_time;
	public String code_of_conduct;
	public String logo;
	public String location_name;

	public RootModel(String privacy, ArrayList<Social_linksModel> social_links, String organizer_description, String schedule_published_on, CopyrightModel copyright, String end_time, String description, String timezone, VersionModel version, String type, CreatorModel creator, Call_for_papersModel call_for_papers, String name, String background_image, String email, int id, String topic, String state, String organizer_name, String start_time, String code_of_conduct, String logo, String location_name) {

		this.privacy = privacy;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.end_time = end_time;
		this.description = description;
		this.timezone = timezone;
		this._version = version;
		this.type = type;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.background_image = background_image;
		this.email = email;
		this.id = id;
		this.topic = topic;
		this.state = state;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.location_name = location_name;

	}

}