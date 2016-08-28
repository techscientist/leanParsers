import java.util.ArrayList;

class RootModel {

	public String end_time;
	public CreatorModel _creator;
	public String location_name;
	public String code_of_conduct;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String background_image;
	public String email;
	public String logo;
	public String timezone;
	public String organizer_name;
	public String name;
	public String state;
	public String privacy;
	public String organizer_description;
	public String description;
	public String schedule_published_on;
	public String topic;
	public int id;
	public CopyrightModel _copyright;
	public String type;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String end_time, CreatorModel creator, String location_name, String code_of_conduct, VersionModel version, ArrayList<Social_linksModel> social_links, String start_time, String background_image, String email, String logo, String timezone, String organizer_name, String name, String state, String privacy, String organizer_description, String description, String schedule_published_on, String topic, int id, CopyrightModel copyright, String type, Call_for_papersModel call_for_papers) {

		this.end_time = end_time;
		this._creator = creator;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.social_links = social_links;
		this.start_time = start_time;
		this.background_image = background_image;
		this.email = email;
		this.logo = logo;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.name = name;
		this.state = state;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.id = id;
		this._copyright = copyright;
		this.type = type;
		this._call_for_papers = call_for_papers;

	}

}