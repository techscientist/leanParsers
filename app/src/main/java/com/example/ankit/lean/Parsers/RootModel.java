import java.util.ArrayList;

class RootModel {

	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String description;
	public String start_time;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String type;
	public int id;
	public String end_time;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String state;
	public String name;
	public String logo;
	public String timezone;
	public String schedule_published_on;
	public String organizer_description;
	public String privacy;
	public String code_of_conduct;
	public String background_image;
	public String location_name;

	public RootModel(String email, ArrayList<Social_linksModel> social_links, String organizer_name, String description, String start_time, String topic, Call_for_papersModel call_for_papers, CreatorModel creator, String type, int id, String end_time, VersionModel version, CopyrightModel copyright, String state, String name, String logo, String timezone, String schedule_published_on, String organizer_description, String privacy, String code_of_conduct, String background_image, String location_name) {

		this.email = email;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.description = description;
		this.start_time = start_time;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.type = type;
		this.id = id;
		this.end_time = end_time;
		this._version = version;
		this._copyright = copyright;
		this.state = state;
		this.name = name;
		this.logo = logo;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.location_name = location_name;

	}

}