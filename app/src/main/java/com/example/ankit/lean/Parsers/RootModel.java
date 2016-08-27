import java.util.ArrayList;

class RootModel {

	public String email;
	public String organizer_description;
	public String location_name;
	public String state;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String privacy;
	public int id;
	public String background_image;
	public String end_time;
	public String topic;
	public String description;
	public String logo;
	public String schedule_published_on;
	public String organizer_name;
	public String timezone;
	public String type;
	public String start_time;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String email, String organizer_description, String location_name, String state, CreatorModel creator, CopyrightModel copyright, VersionModel version, String privacy, int id, String background_image, String end_time, String topic, String description, String logo, String schedule_published_on, String organizer_name, String timezone, String type, String start_time, String code_of_conduct, ArrayList<Social_linksModel> social_links, String name, Call_for_papersModel call_for_papers) {

		this.email = email;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.state = state;
		this._creator = creator;
		this._copyright = copyright;
		this._version = version;
		this.privacy = privacy;
		this.id = id;
		this.background_image = background_image;
		this.end_time = end_time;
		this.topic = topic;
		this.description = description;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.type = type;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.name = name;
		this._call_for_papers = call_for_papers;

	}

}