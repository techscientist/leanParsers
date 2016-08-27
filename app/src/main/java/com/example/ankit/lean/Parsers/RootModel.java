import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String email;
	public CreatorModel _creator;
	public String location_name;
	public String privacy;
	public String schedule_published_on;
	public String code_of_conduct;
	public String state;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String organizer_description;
	public String timezone;
	public int id;
	public String logo;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String topic;
	public String description;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String name;

	public RootModel(String start_time, String email, CreatorModel creator, String location_name, String privacy, String schedule_published_on, String code_of_conduct, String state, String type, ArrayList<Social_linksModel> social_links, String organizer_name, String organizer_description, String timezone, int id, String logo, String background_image, Call_for_papersModel call_for_papers, String end_time, String topic, String description, CopyrightModel copyright, VersionModel version, String name) {

		this.start_time = start_time;
		this.email = email;
		this._creator = creator;
		this.location_name = location_name;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.type = type;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.id = id;
		this.logo = logo;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.topic = topic;
		this.description = description;
		this._copyright = copyright;
		this._version = version;
		this.name = name;

	}

}