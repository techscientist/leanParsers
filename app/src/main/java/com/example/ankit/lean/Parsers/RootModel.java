import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String description;
	public String email;
	public String background_image;
	public String name;
	public String type;
	public String state;
	public String organizer_description;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String timezone;
	public String location_name;
	public VersionModel _version;
	public String topic;
	public int id;
	public String privacy;
	public String schedule_published_on;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String logo;
	public String end_time;

	public RootModel(CopyrightModel copyright, String description, String email, String background_image, String name, String type, String state, String organizer_description, String code_of_conduct, Call_for_papersModel call_for_papers, String organizer_name, String timezone, String location_name, VersionModel version, String topic, int id, String privacy, String schedule_published_on, String start_time, ArrayList<Social_linksModel> social_links, CreatorModel creator, String logo, String end_time) {

		this._copyright = copyright;
		this.description = description;
		this.email = email;
		this.background_image = background_image;
		this.name = name;
		this.type = type;
		this.state = state;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.location_name = location_name;
		this._version = version;
		this.topic = topic;
		this.id = id;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.social_links = social_links;
		this._creator = creator;
		this.logo = logo;
		this.end_time = end_time;

	}

}