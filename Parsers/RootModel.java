import java.util.ArrayList;

class RootModel {

	public int id;
	public String type;
	public String start_time;
	public String logo;
	public CreatorModel _creator;
	public String organizer_description;
	public String code_of_conduct;
	public String schedule_published_on;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public CopyrightModel _copyright;
	public String timezone;
	public String name;
	public String description;
	public String privacy;
	public VersionModel _version;
	public String state;
	public String organizer_name;
	public String location_name;
	public String end_time;
	public String email;
	public Call_for_papersModel _call_for_papers;

	public RootModel(int id, String type, String start_time, String logo, CreatorModel creator, String organizer_description, String code_of_conduct, String schedule_published_on, String topic, ArrayList<Social_linksModel> social_links, String background_image, CopyrightModel copyright, String timezone, String name, String description, String privacy, VersionModel version, String state, String organizer_name, String location_name, String end_time, String email, Call_for_papersModel call_for_papers) {

		this.id = id;
		this.type = type;
		this.start_time = start_time;
		this.logo = logo;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.social_links = social_links;
		this.background_image = background_image;
		this._copyright = copyright;
		this.timezone = timezone;
		this.name = name;
		this.description = description;
		this.privacy = privacy;
		this._version = version;
		this.state = state;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.end_time = end_time;
		this.email = email;
		this._call_for_papers = call_for_papers;

	}

}