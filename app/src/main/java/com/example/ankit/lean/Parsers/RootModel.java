import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String state;
	public CreatorModel _creator;
	public String privacy;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String logo;
	public String description;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public CopyrightModel _copyright;
	public String end_time;
	public String email;
	public String organizer_description;
	public String type;
	public VersionModel _version;
	public String background_image;
	public String code_of_conduct;
	public String timezone;
	public int id;
	public String organizer_name;

	public RootModel(String location_name, String state, CreatorModel creator, String privacy, String schedule_published_on, Call_for_papersModel call_for_papers, String start_time, String logo, String description, String name, ArrayList<Social_linksModel> social_links, String topic, CopyrightModel copyright, String end_time, String email, String organizer_description, String type, VersionModel version, String background_image, String code_of_conduct, String timezone, int id, String organizer_name) {

		this.location_name = location_name;
		this.state = state;
		this._creator = creator;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.logo = logo;
		this.description = description;
		this.name = name;
		this.social_links = social_links;
		this.topic = topic;
		this._copyright = copyright;
		this.end_time = end_time;
		this.email = email;
		this.organizer_description = organizer_description;
		this.type = type;
		this._version = version;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.id = id;
		this.organizer_name = organizer_name;

	}

}