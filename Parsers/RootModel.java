import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String email;
	public String timezone;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String code_of_conduct;
	public String organizer_name;
	public String privacy;
	public String topic;
	public String start_time;
	public String schedule_published_on;
	public CreatorModel _creator;
	public VersionModel _version;
	public String state;
	public String location_name;
	public String background_image;
	public String organizer_description;
	public int id;
	public String description;

	public RootModel(String end_time, String type, Call_for_papersModel call_for_papers, String name, String email, String timezone, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String logo, String code_of_conduct, String organizer_name, String privacy, String topic, String start_time, String schedule_published_on, CreatorModel creator, VersionModel version, String state, String location_name, String background_image, String organizer_description, int id, String description) {

		this.end_time = end_time;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.email = email;
		this.timezone = timezone;
		this._copyright = copyright;
		this.social_links = social_links;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.topic = topic;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this._version = version;
		this.state = state;
		this.location_name = location_name;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.id = id;
		this.description = description;

	}

}