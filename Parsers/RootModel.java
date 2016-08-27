import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String organizer_name;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String topic;
	public String code_of_conduct;
	public String type;
	public String description;
	public String background_image;
	public String location_name;
	public String privacy;
	public String end_time;
	public String timezone;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String state;
	public String email;
	public String logo;
	public String organizer_description;
	public String name;

	public RootModel(String schedule_published_on, ArrayList<Social_linksModel> social_links, int id, String organizer_name, CopyrightModel copyright, CreatorModel creator, String topic, String code_of_conduct, String type, String description, String background_image, String location_name, String privacy, String end_time, String timezone, VersionModel version, Call_for_papersModel call_for_papers, String start_time, String state, String email, String logo, String organizer_description, String name) {

		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.id = id;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this._creator = creator;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.description = description;
		this.background_image = background_image;
		this.location_name = location_name;
		this.privacy = privacy;
		this.end_time = end_time;
		this.timezone = timezone;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.state = state;
		this.email = email;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.name = name;

	}

}