import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String topic;
	public String email;
	public String organizer_description;
	public String state;
	public String location_name;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String type;
	public String schedule_published_on;
	public String logo;
	public String description;
	public String organizer_name;
	public String background_image;
	public CreatorModel _creator;
	public String timezone;
	public String start_time;
	public String privacy;
	public CopyrightModel _copyright;
	public int id;
	public VersionModel _version;

	public RootModel(String code_of_conduct, String topic, String email, String organizer_description, String state, String location_name, String end_time, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String name, String type, String schedule_published_on, String logo, String description, String organizer_name, String background_image, CreatorModel creator, String timezone, String start_time, String privacy, CopyrightModel copyright, int id, VersionModel version) {

		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.email = email;
		this.organizer_description = organizer_description;
		this.state = state;
		this.location_name = location_name;
		this.end_time = end_time;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.description = description;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._creator = creator;
		this.timezone = timezone;
		this.start_time = start_time;
		this.privacy = privacy;
		this._copyright = copyright;
		this.id = id;
		this._version = version;

	}

}