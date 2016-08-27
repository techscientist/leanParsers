import java.util.ArrayList;

class RootModel {

	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public int id;
	public String email;
	public String background_image;
	public String type;
	public String state;
	public String privacy;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String logo;
	public VersionModel _version;
	public String organizer_name;
	public String start_time;
	public String end_time;
	public String topic;
	public CopyrightModel _copyright;
	public String description;

	public RootModel(String name, ArrayList<Social_linksModel> social_links, String timezone, int id, String email, String background_image, String type, String state, String privacy, String code_of_conduct, CreatorModel creator, String schedule_published_on, String organizer_description, Call_for_papersModel call_for_papers, String location_name, String logo, VersionModel version, String organizer_name, String start_time, String end_time, String topic, CopyrightModel copyright, String description) {

		this.name = name;
		this.social_links = social_links;
		this.timezone = timezone;
		this.id = id;
		this.email = email;
		this.background_image = background_image;
		this.type = type;
		this.state = state;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.logo = logo;
		this._version = version;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.end_time = end_time;
		this.topic = topic;
		this._copyright = copyright;
		this.description = description;

	}

}