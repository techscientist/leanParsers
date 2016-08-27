import java.util.ArrayList;

class RootModel {

	public String name;
	public String privacy;
	public String timezone;
	public String code_of_conduct;
	public String topic;
	public String start_time;
	public String description;
	public String end_time;
	public String location_name;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String organizer_description;
	public CreatorModel _creator;
	public String state;
	public VersionModel _version;
	public String schedule_published_on;
	public String email;
	public String organizer_name;
	public String background_image;
	public String type;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String name, String privacy, String timezone, String code_of_conduct, String topic, String start_time, String description, String end_time, String location_name, int id, ArrayList<Social_linksModel> social_links, String logo, String organizer_description, CreatorModel creator, String state, VersionModel version, String schedule_published_on, String email, String organizer_name, String background_image, String type, CopyrightModel copyright, Call_for_papersModel call_for_papers) {

		this.name = name;
		this.privacy = privacy;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.start_time = start_time;
		this.description = description;
		this.end_time = end_time;
		this.location_name = location_name;
		this.id = id;
		this.social_links = social_links;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.state = state;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.type = type;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;

	}

}