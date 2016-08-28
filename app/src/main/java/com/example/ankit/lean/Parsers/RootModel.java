import java.util.ArrayList;

class RootModel {

	public String privacy;
	public int id;
	public String background_image;
	public String logo;
	public String description;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String name;
	public String timezone;
	public String organizer_description;
	public String state;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String type;
	public String start_time;
	public String end_time;
	public String email;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String location_name;

	public RootModel(String privacy, int id, String background_image, String logo, String description, String schedule_published_on, CopyrightModel copyright, String organizer_name, String name, String timezone, String organizer_description, String state, String topic, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, VersionModel version, String type, String start_time, String end_time, String email, String code_of_conduct, CreatorModel creator, String location_name) {

		this.privacy = privacy;
		this.id = id;
		this.background_image = background_image;
		this.logo = logo;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.name = name;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.state = state;
		this.topic = topic;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.type = type;
		this.start_time = start_time;
		this.end_time = end_time;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.location_name = location_name;

	}

}