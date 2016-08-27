import java.util.ArrayList;

class RootModel {

	public String description;
	public String end_time;
	public String type;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String organizer_description;
	public String organizer_name;
	public String background_image;
	public int id;
	public String topic;
	public String name;
	public String email;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String state;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String start_time;
	public String timezone;
	public String logo;

	public RootModel(String description, String end_time, String type, CreatorModel creator, String schedule_published_on, String organizer_description, String organizer_name, String background_image, int id, String topic, String name, String email, String location_name, ArrayList<Social_linksModel> social_links, String privacy, String state, VersionModel version, Call_for_papersModel call_for_papers, CopyrightModel copyright, String code_of_conduct, String start_time, String timezone, String logo) {

		this.description = description;
		this.end_time = end_time;
		this.type = type;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.id = id;
		this.topic = topic;
		this.name = name;
		this.email = email;
		this.location_name = location_name;
		this.social_links = social_links;
		this.privacy = privacy;
		this.state = state;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.timezone = timezone;
		this.logo = logo;

	}

}