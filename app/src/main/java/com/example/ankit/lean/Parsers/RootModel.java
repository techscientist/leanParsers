import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String topic;
	public String type;
	public String end_time;
	public CreatorModel _creator;
	public String email;
	public String name;
	public String organizer_name;
	public String description;
	public String background_image;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String logo;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String schedule_published_on;
	public VersionModel _version;
	public String state;
	public String organizer_description;
	public String code_of_conduct;
	public String location_name;

	public RootModel(CopyrightModel copyright, String topic, String type, String end_time, CreatorModel creator, String email, String name, String organizer_name, String description, String background_image, int id, Call_for_papersModel call_for_papers, String privacy, String logo, String start_time, ArrayList<Social_linksModel> social_links, String timezone, String schedule_published_on, VersionModel version, String state, String organizer_description, String code_of_conduct, String location_name) {

		this._copyright = copyright;
		this.topic = topic;
		this.type = type;
		this.end_time = end_time;
		this._creator = creator;
		this.email = email;
		this.name = name;
		this.organizer_name = organizer_name;
		this.description = description;
		this.background_image = background_image;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.logo = logo;
		this.start_time = start_time;
		this.social_links = social_links;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.state = state;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;

	}

}