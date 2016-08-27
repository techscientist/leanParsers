import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String email;
	public String type;
	public String end_time;
	public String organizer_name;
	public VersionModel _version;
	public String topic;
	public String state;
	public String start_time;
	public String organizer_description;
	public int id;
	public String description;
	public String location_name;
	public String logo;
	public String timezone;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String schedule_published_on;
	public String privacy;
	public String name;

	public RootModel(CopyrightModel copyright, ArrayList<Social_linksModel> social_links, CreatorModel creator, String email, String type, String end_time, String organizer_name, VersionModel version, String topic, String state, String start_time, String organizer_description, int id, String description, String location_name, String logo, String timezone, String code_of_conduct, Call_for_papersModel call_for_papers, String background_image, String schedule_published_on, String privacy, String name) {

		this._copyright = copyright;
		this.social_links = social_links;
		this._creator = creator;
		this.email = email;
		this.type = type;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._version = version;
		this.topic = topic;
		this.state = state;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.id = id;
		this.description = description;
		this.location_name = location_name;
		this.logo = logo;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.name = name;

	}

}