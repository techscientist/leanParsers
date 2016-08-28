import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String timezone;
	public String code_of_conduct;
	public String state;
	public String description;
	public String name;
	public String logo;
	public String background_image;
	public VersionModel _version;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String topic;
	public String type;
	public String organizer_description;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String schedule_published_on;
	public String email;
	public String location_name;
	public CopyrightModel _copyright;
	public String organizer_name;

	public RootModel(String privacy, String timezone, String code_of_conduct, String state, String description, String name, String logo, String background_image, VersionModel version, String end_time, ArrayList<Social_linksModel> social_links, CreatorModel creator, String topic, String type, String organizer_description, int id, Call_for_papersModel call_for_papers, String start_time, String schedule_published_on, String email, String location_name, CopyrightModel copyright, String organizer_name) {

		this.privacy = privacy;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.description = description;
		this.name = name;
		this.logo = logo;
		this.background_image = background_image;
		this._version = version;
		this.end_time = end_time;
		this.social_links = social_links;
		this._creator = creator;
		this.topic = topic;
		this.type = type;
		this.organizer_description = organizer_description;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.location_name = location_name;
		this._copyright = copyright;
		this.organizer_name = organizer_name;

	}

}