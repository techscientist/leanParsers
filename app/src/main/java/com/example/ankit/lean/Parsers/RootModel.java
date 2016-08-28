import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String email;
	public String schedule_published_on;
	public String background_image;
	public String type;
	public String code_of_conduct;
	public String privacy;
	public String description;
	public String logo;
	public String organizer_description;
	public String start_time;
	public CreatorModel _creator;
	public String state;
	public String timezone;
	public String name;
	public String end_time;
	public String location_name;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public int id;

	public RootModel(CopyrightModel copyright, String email, String schedule_published_on, String background_image, String type, String code_of_conduct, String privacy, String description, String logo, String organizer_description, String start_time, CreatorModel creator, String state, String timezone, String name, String end_time, String location_name, String topic, Call_for_papersModel call_for_papers, VersionModel version, String organizer_name, ArrayList<Social_linksModel> social_links, int id) {

		this._copyright = copyright;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.description = description;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this._creator = creator;
		this.state = state;
		this.timezone = timezone;
		this.name = name;
		this.end_time = end_time;
		this.location_name = location_name;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.id = id;

	}

}