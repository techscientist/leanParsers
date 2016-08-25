import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String timezone;
	public String schedule_published_on;
	public String organizer_description;
	public String privacy;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String description;
	public String background_image;
	public CopyrightModel _copyright;
	public String type;
	public int id;
	public VersionModel _version;
	public String email;
	public String topic;
	public String logo;
	public String state;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;

	public RootModel(String end_time, String location_name, Call_for_papersModel call_for_papers, String start_time, String timezone, String schedule_published_on, String organizer_description, String privacy, CreatorModel creator, String code_of_conduct, String description, String background_image, CopyrightModel copyright, String type, int id, VersionModel version, String email, String topic, String logo, String state, String name, ArrayList<Social_linksModel> social_links, String organizer_name) {

		this.end_time = end_time;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.background_image = background_image;
		this._copyright = copyright;
		this.type = type;
		this.id = id;
		this._version = version;
		this.email = email;
		this.topic = topic;
		this.logo = logo;
		this.state = state;
		this.name = name;
		this.social_links = social_links;
		this.organizer_name = organizer_name;

	}

}