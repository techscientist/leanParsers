import java.util.ArrayList;

class RootModel {

	public String background_image;
	public int id;
	public String state;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String organizer_name;
	public String description;
	public String type;
	public String privacy;
	public String end_time;
	public String timezone;
	public CopyrightModel _copyright;
	public String email;
	public String topic;
	public String organizer_description;
	public CreatorModel _creator;
	public String name;
	public VersionModel _version;
	public String code_of_conduct;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String location_name;

	public RootModel(String background_image, int id, String state, String start_time, ArrayList<Social_linksModel> social_links, String schedule_published_on, String organizer_name, String description, String type, String privacy, String end_time, String timezone, CopyrightModel copyright, String email, String topic, String organizer_description, CreatorModel creator, String name, VersionModel version, String code_of_conduct, String logo, Call_for_papersModel call_for_papers, String location_name) {

		this.background_image = background_image;
		this.id = id;
		this.state = state;
		this.start_time = start_time;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.description = description;
		this.type = type;
		this.privacy = privacy;
		this.end_time = end_time;
		this.timezone = timezone;
		this._copyright = copyright;
		this.email = email;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.name = name;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;

	}

}