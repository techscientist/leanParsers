import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String code_of_conduct;
	public String privacy;
	public String logo;
	public CopyrightModel _copyright;
	public String description;
	public String schedule_published_on;
	public String name;
	public CreatorModel _creator;
	public String organizer_name;
	public String state;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public int id;
	public String end_time;
	public VersionModel _version;
	public String background_image;
	public String start_time;
	public String topic;
	public String location_name;

	public RootModel(String organizer_description, String code_of_conduct, String privacy, String logo, CopyrightModel copyright, String description, String schedule_published_on, String name, CreatorModel creator, String organizer_name, String state, String email, Call_for_papersModel call_for_papers, String type, ArrayList<Social_linksModel> social_links, String timezone, int id, String end_time, VersionModel version, String background_image, String start_time, String topic, String location_name) {

		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.logo = logo;
		this._copyright = copyright;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.state = state;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.social_links = social_links;
		this.timezone = timezone;
		this.id = id;
		this.end_time = end_time;
		this._version = version;
		this.background_image = background_image;
		this.start_time = start_time;
		this.topic = topic;
		this.location_name = location_name;

	}

}