import java.util.ArrayList;

class RootModel {

	public String logo;
	public String privacy;
	public CopyrightModel _copyright;
	public String name;
	public VersionModel _version;
	public String start_time;
	public String description;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String background_image;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String timezone;
	public String email;
	public String state;
	public String schedule_published_on;
	public String organizer_description;
	public String end_time;
	public String location_name;

	public RootModel(String logo, String privacy, CopyrightModel copyright, String name, VersionModel version, String start_time, String description, String type, Call_for_papersModel call_for_papers, String topic, String organizer_name, ArrayList<Social_linksModel> social_links, int id, String background_image, CreatorModel creator, String code_of_conduct, String timezone, String email, String state, String schedule_published_on, String organizer_description, String end_time, String location_name) {

		this.logo = logo;
		this.privacy = privacy;
		this._copyright = copyright;
		this.name = name;
		this._version = version;
		this.start_time = start_time;
		this.description = description;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.id = id;
		this.background_image = background_image;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.email = email;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.location_name = location_name;

	}

}