import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String state;
	public String name;
	public String topic;
	public String location_name;
	public String organizer_name;
	public String schedule_published_on;
	public int id;
	public String code_of_conduct;
	public String organizer_description;
	public String privacy;
	public CopyrightModel _copyright;
	public String type;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String end_time;
	public String start_time;
	public VersionModel _version;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String description;

	public RootModel(String timezone, String state, String name, String topic, String location_name, String organizer_name, String schedule_published_on, int id, String code_of_conduct, String organizer_description, String privacy, CopyrightModel copyright, String type, String background_image, Call_for_papersModel call_for_papers, String logo, String end_time, String start_time, VersionModel version, String email, ArrayList<Social_linksModel> social_links, CreatorModel creator, String description) {

		this.timezone = timezone;
		this.state = state;
		this.name = name;
		this.topic = topic;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this._copyright = copyright;
		this.type = type;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.end_time = end_time;
		this.start_time = start_time;
		this._version = version;
		this.email = email;
		this.social_links = social_links;
		this._creator = creator;
		this.description = description;

	}

}