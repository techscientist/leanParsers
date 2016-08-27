import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String name;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String end_time;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public CreatorModel _creator;
	public int id;
	public String privacy;
	public String type;
	public String state;
	public String schedule_published_on;
	public String organizer_name;
	public String organizer_description;
	public String topic;
	public String timezone;
	public String email;
	public String start_time;
	public String description;

	public RootModel(String background_image, String name, String logo, Call_for_papersModel call_for_papers, String location_name, ArrayList<Social_linksModel> social_links, VersionModel version, String end_time, CopyrightModel copyright, String code_of_conduct, CreatorModel creator, int id, String privacy, String type, String state, String schedule_published_on, String organizer_name, String organizer_description, String topic, String timezone, String email, String start_time, String description) {

		this.background_image = background_image;
		this.name = name;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.social_links = social_links;
		this._version = version;
		this.end_time = end_time;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.id = id;
		this.privacy = privacy;
		this.type = type;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.timezone = timezone;
		this.email = email;
		this.start_time = start_time;
		this.description = description;

	}

}