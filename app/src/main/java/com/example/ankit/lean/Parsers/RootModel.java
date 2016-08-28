import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String description;
	public String email;
	public String code_of_conduct;
	public String start_time;
	public String organizer_name;
	public String state;
	public String schedule_published_on;
	public String type;
	public String privacy;
	public String topic;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String location_name;
	public CreatorModel _creator;
	public String organizer_description;
	public CopyrightModel _copyright;
	public int id;
	public String logo;
	public String end_time;
	public String timezone;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String background_image, String description, String email, String code_of_conduct, String start_time, String organizer_name, String state, String schedule_published_on, String type, String privacy, String topic, VersionModel version, ArrayList<Social_linksModel> social_links, String name, String location_name, CreatorModel creator, String organizer_description, CopyrightModel copyright, int id, String logo, String end_time, String timezone, Call_for_papersModel call_for_papers) {

		this.background_image = background_image;
		this.description = description;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.privacy = privacy;
		this.topic = topic;
		this._version = version;
		this.social_links = social_links;
		this.name = name;
		this.location_name = location_name;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.id = id;
		this.logo = logo;
		this.end_time = end_time;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;

	}

}